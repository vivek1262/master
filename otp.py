import pandas

wiki = pandas.read_html("https://en.wikipedia.org/wiki/2012_Andhra_Pradesh_by-election")

election = wiki[4]
print(election)