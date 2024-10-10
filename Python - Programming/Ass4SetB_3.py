from datetime import datetime

now = datetime.now()

current_date = now.strftime("%Y-%m-%d")
current_time = now.strftime("%H:%M:%S")

print(f"Today's date: {current_date}")
print(f"Current time: {current_time}")
