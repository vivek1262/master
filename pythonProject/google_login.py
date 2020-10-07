from selenium import webdriver
from time import sleep

driver = webdriver.Chrome()
driver.get("https://www.google.com")
driver.find_element_by_name("q").send_keys("vivek")
sleep(12)
driver.find_element_by_name("btnK").click()


driver.close()