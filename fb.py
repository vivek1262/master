from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://facebook.com")
driver.find_element_by_name("email").send_keys("vivek_it62@gmail.com")
time.sleep(5)
driver.find_element_by_name("pass").send_keys("Svivek123#")
time.sleep(5)
driver.find_element_by_name("login").click()
time.sleep(5)
driver.close()


print("fb login success")