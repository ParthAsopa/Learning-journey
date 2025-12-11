import tkinter as tk, time


def sec_to_time(tf, ti):
    global time_sec
    time_sec = round((tf - ti), 3)
    milsec = int((time_sec * 1000) % 1000)
    sec = int((time_sec * 1000) // 1000)
    minutes = int((time_sec // 60) % 60)
    hours = int(time_sec // 3600)
    return f"{hours}:{minutes}:{sec}:{milsec}"


def start():
    global ti, running
    ti = time.time()
    running = True


def stop():
    global running
    running = False


def disp_curent():
    global tf
    tf = time.time()
    w.config(text=sec_to_time(tf, ti))


m = tk.Tk()
m.title("Stopwatch")
b1 = tk.Button(m, text="Start", command=start)
w = tk.Label(m, text="0:0:0:000")
w.pack()
b1.pack()
b2 = tk.Button(m, text="Stop", command=stop)
b2.pack()
while running:
    time.sleep(0.001)
    disp_curent()
m.mainloop()
