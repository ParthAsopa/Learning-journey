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
    w.config(text="0:0:0:000")


def stop():
    global tf, running
    tf = time.time()
    running = False
    w.config(text=sec_to_time(tf, ti))


m = tk.Tk()
width = m.winfo_screenwidth()
m.title("Stopwatch")
b1 = tk.Button(m, text="Start", command=start)
w = tk.Label(m, text="0:0:0:000")
w.grid(row=0, column=0, sticky="nsew", columnspan=2)
b1.grid(row=1, column=0, sticky="nsew")
b2 = tk.Button(m, text="Stop", command=stop)
b2.grid(row=1, column=1, sticky="nsew")
m.columnconfigure(0, minsize=(width / 2))
m.columnconfigure(1, minsize=(width / 2))
m.mainloop()
