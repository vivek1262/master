from tkinter import *
from tkinter.ttk import *
from time import strftime


root = Tk()
root.title("clock")
root.geometry('250x250')
def time():
    string = strftime('%D-->%H:%M:%S %P')
    l1.config(text=string)
    l1.after(1000, time)


l1 = Label(root,font =('calibri',40,'bold'),background= 'yellow',foreground='red')
l1.pack(anchor = "center")
# l1.grid(row=10,column=50)
time()
root.mainloop()