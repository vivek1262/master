from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://www.geeksforgeeks.org/python-tkinter-tutorial/#geometry")
driver.find_element_by_xpath("/html/body/div[2]/div[2]/div/article/div/div[2]/ul[1]/li[4]/a").click()
time.sleep(5)
driver.forward()
time.sleep(5)

driver.close()