def converter(s, y):
    return ''.join(c if c == ' ' else chr(ord(c) + y) for c in s)

def deconverter(s, y):
    return ''.join(c if c == ' ' else chr(ord(c) - y) for c in s)

i = int(input("Input the shift number: "))
m = input("Input the message: ")

hid = converter(m, i)
dehid = deconverter(hid, i)

print("Original  | " + m)
print("Encoded   | " + hid)
print("Decoded   | " + dehid)
