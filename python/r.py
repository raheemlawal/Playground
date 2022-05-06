import requests

r = requests.get('https://swapi.dev/api/starships/9/')
print(r.json())