from tkinter import *

driver =Tk()
driver.maxsize(200,200)

B = Button(driver,text = "Hello")
B.grid(row = 0,column = 0)
T = Entry(driver,text = "")
T.grid(row = 0,column = 1)
driver.mainloop()