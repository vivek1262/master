from selenium import webdriver
import time

win = webdriver.Chrome()
win.get("https://www.gmail.com")
win.find_element_by_name("identifier").send_keys("vivek254258@gmail.com")
time.sleep(5)
win.find_element_by_xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]").click()
time.sleep(5)
win.find_element_by_name("password").send_keys("Svivek123#")
time.sleep(5)
win.find_element_by_xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]").click()
win.close()