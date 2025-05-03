def fixed_heap_dynamic():
    # Fixed-size list created using list() — heap-allocated
    arr = list(range(5))  # [0, 1, 2, 3, 4]

    # Modify contents
    for i in range(len(arr)):
        arr[i] = (i + 1) * 10

    # Display the list
    print("Fixed Heap-Dynamic Array:")
    print(arr)


fixed_heap_dynamic()
