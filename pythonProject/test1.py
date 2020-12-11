from tkinter import *
from tkinter.ttk import *

master = Tk()
master.geometry('250x200')
Tb1 = Label(master,text="User").place(x=40,y=60)
Tb2 = Label(master,text="Pass").place(x=40,y=80)
Btn = Button(master,text = "Submit").place(x=40,y=130)
Lb1 = Entry(master,width=40).place(x=110,y=60)
Lb2 = Entry(master,width=40).place(x=110,y=100)
master.mainloop()