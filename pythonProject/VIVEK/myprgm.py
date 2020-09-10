from selenium import webdriver
import time

driver = webdriver.Chrome()

driver.get("http://www.github.com")

driver.find_element_by_xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]").click()
time.sleep(5)

driver.find_element_by_name("login").send_keys("vivek1262")
driver.find_element_by_id("password").send_keys("Svivek123#")
time.sleep(5)
driver.find_element_by_name("commit").click()
time.sleep(5)
driver.find_element_by_xpath("/html/body/div[1]/header/div[7]/details/summary").click()
time.sleep(5)
driver.find_element_by_xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button").click()
time.sleep(5)
driver.close()