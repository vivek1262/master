from selenium.webdriver.common.keys import Keys
from selenium import webdriver


browser = webdriver.Chrome()

browser.get('https://www.youtube.com')

SearchBar = browser.find_element_by_name("search_query").send_keys("Selenium", Keys.ENTER)

Video = browser.find_element_by_id("javabrains")
Video.click()