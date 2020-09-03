from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("http://www.youtube.com")
time.sleep(5)


driver.close()