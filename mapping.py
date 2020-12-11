import smtplib
MyObj = smtplib.SMTP("smtp.mail.yahoo.com" , 465)
MyObj.ehlo()
MyObj.starttls()
MyObj.ehlo()
MyObj.login("vivek1262@yahoo.com","9492716980")
MyObj.sendmail("vivek1262@yahoo.com" , "vivek1262@yahoo.com" ,"Subject:Hello\n How r u?")
MyObj.quit()