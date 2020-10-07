from selenium import webdriver
from selenium.webdriver.common.keys import *
from time import sleep

root = webdriver.Chrome()
root.get("http://www.google.com")
sleep(5)
root.execute_script("window.open('https://www.lambdatest.com','new tab')")

root.close()
print("success")