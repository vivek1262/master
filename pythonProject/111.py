from selenium import webdriver
import time
driver = webdriver.Chrome()
driver.get("http://www.google.com")

time.sleep(5)
driver.find_element_by_xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input").send_keys("smiley")
time.sleep(5)
driver.find_element_by_name("btnK").click()
time.sleep(5)
driver.back()
time.sleep(10)
driver.forward()
time.sleep(10)
print("success")
driver.close()
