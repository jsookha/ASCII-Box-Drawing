"""
Python Example: Box Drawing with JSON Dataset

Use Case:
- Demonstrates how Python can load JSON data and process strings.
- Useful for teaching parsing, string manipulation, and algorithmic thinking.
- Can be extended into CLI tools or automated documentation scripts.
"""

import json

# Load dataset
with open('../datasets/box-drawing-common.json', 'r', encoding='utf-8') as f:
    chars = json.load(f)

def get_symbol(unicode_code):
    return next(c['symbol'] for c in chars if c['unicode'] == unicode_code)

# Select characters
horiz = get_symbol('U+2500')
vert  = get_symbol('U+2502')
tl    = get_symbol('U+250C')
tr    = get_symbol('U+2510')
bl    = get_symbol('U+2514')
br    = get_symbol('U+2518')

def box_text(text):
    width = len(text)
    return (
        f"{tl}{horiz*width}{tr}\n"
        f"{vert}{text}{vert}\n"
        f"{bl}{horiz*width}{br}"
    )

# Example output
print(box_text("Hello World"))