def heap_dynamic():
    arr = []  # empty list, heap-allocated

    # Add elements dynamically
    arr.append(10)
    arr.append(20)
    arr.append(30)
    arr.append(40)

    # Modify content
    arr[1] = 25  # change 20 to 25
    arr.pop()  # remove last element (40)

    # Add more elements
    arr.extend([50, 60])

    # Display the list
    print("Heap-Dynamic Array:")
    print(arr)


heap_dynamic()
