package com.springtraining.data.transactions.programmatic.usingtxtemplate;

import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.springtraining.data.IUserDao;
import com.springtraining.data.User;

/**This class demonstrates how to use transaction template to programatically 
 * handle transactions.
 * 
 */
public class TxTemplatedUserDao implements IUserDao  {

	private JdbcTemplate jdbcTemplate;
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
		//set transaction propagation behaviour like this
		this.transactionTemplate.setPropagationBehavior(TransactionTemplate.PROPAGATION_REQUIRES_NEW);
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void deleteUser(final int uid) {
		//use TransactionCallbackWithoutResult handler if ur query doesnt result anything
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			protected void doInTransactionWithoutResult(
					TransactionStatus paramTransactionStatus) {
				try{
				String delQuery = "delete from users where id = ?";
				jdbcTemplate.update(delQuery, new Object[]{uid});
				}catch (Exception e) {
					//use this to rollback exception in case of exception
					paramTransactionStatus.setRollbackOnly();
				}
			}
		});
	}

	public int insertUser(final User user) {
	//use TransactionCallback handler if some result is returned
	return	transactionTemplate.execute(new TransactionCallback<Integer>() {
			public Integer doInTransaction(
					TransactionStatus paramTransactionStatus) {
				String inserQuery = "insert into users (username, password, enabled , id) values (?, ?, ?, ?) ";
				Object[] params = new Object[]{user.getUserName(), user.getPassword(),user.isEnabled(),user.getId()};
				int[] types = new int[]{Types.VARCHAR,Types.VARCHAR,Types.BIT,Types.INTEGER};
				return jdbcTemplate.update(inserQuery,params,types);
			}
		});
	}

	public User selectUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
