def end_corona(recovers, new_cases, active_cases):
  days = 0
  while active_cases > 0:
    active_cases += new_cases
    active_cases -= recovers
    days += 1
  return days

print(end_corona(4000, 2000, 77000))