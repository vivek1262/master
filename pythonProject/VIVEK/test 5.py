from tkinter import *
from tkinter import messagebox

root = Tk()
root.geometry('300x300')
Label(root,text = "hello").pack()
Checkbutton(root,text = "H1").pack()
L1 = Button(root,text = "Don't Click Me",command = root.destroy,bg = 'yellow')
L1.pack(padx = 10)
L2 = Button(root,text = "Click Me",command = L1.destroy)
L2.pack(pady =10)
messagebox.askyesno("ask me","yes or no")
print("Success")


mainloop()