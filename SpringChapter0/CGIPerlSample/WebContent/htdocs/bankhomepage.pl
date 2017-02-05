#!C:/Trainings/Softwares/ActivePerl64/bin/perl.exe

@months = qw(Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec);
@weekDays = qw(Sun Mon Tue Wed Thu Fri Sat Sun);
($second, $minute, $hour, $dayOfMonth, $month, $yearOffset, $dayOfWeek, $dayOfYear, $daylightSavings) = localtime();
$year = 1900 + $yearOffset;
$theTime = "$weekDays[$dayOfWeek] $months[$month] $dayOfMonth, $year";


print "Content-type: text/html; charset=iso-8859-1\n\n";
print "<html>";
print "<body>";
print "<h1>Welcome to Spring Bank</h1>";

print "<a href=accounts.html>Click here to jump to the find the account types being offered by bank</a>";
print "<br/>";
print "<a href=loans.html>Click here to jump to the Loans offer Page</a>";
print "<br/>";
print "<a href=cards.html>Click here to jump to the Cards offer Page</a>";

print "<p>$theTime</p>";

print "</body>";
print "</html>";