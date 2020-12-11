from PIL import Image

pic = Image.open(r"/home/dhanvika/Downloads/IMG-20180710-WA0001.jpg")
# pic.show()
# print(pic.mode)
# print(pic.size)
# angle = 40
# r_pic = pic.rotate(angle)
# print(r_pic)
size = (40,90)
r_pic = pic.resize(size)
r_pic.show()
