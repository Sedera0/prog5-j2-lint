import re
from pathlib import Path
from spellchecker import SpellChecker

spell = SpellChecker(language='en')
java_files = Path("src").rglob("*.java")

for f in java_files:
    with f.open() as file:
        content = file.read()
    words = re.findall(r'\b[A-Za-z][a-zA-Z0-9]*\b', content)
    for w in words:
        if spell.unknown([w]):
            print(f"{f}: '{w}' might not be English")
