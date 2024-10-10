from datetime import datetime
import time

current_time = datetime.now()

formatted_time = current_time.strftime("%a %b %d %H:%M:%S %Z %Y")

print(formatted_time)
