import pyttsx3
import PyPDF2
book = open("/home/dhanvika/progit.pdf",'rb')
pdfReader = PyPDF2.PdfFileReader(book)
pages = pdfReader.numPages
speaker = pyttsx3.init()
for num in range(13,pages):
    page = pdfReader.getPage(13)
    text = page.extractText()
    speaker.say(text)
    speaker.runAndWait()