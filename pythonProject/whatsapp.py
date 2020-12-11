import pywhatkit

try:
    pywhatkit.sendwhatmsg('+919492716980','hello me',21,51)
    print("message sent successfully")
# pywhatkit.search('google')
except:
    print("network error")
