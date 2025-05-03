def fixed_stack_dynamic():
    # Fixed size list created inside function (stack memory)
    arr = [0] * 5  # fixed size of 5 elements

    # Assign values
    for i in range(len(arr)):
        arr[i] = i + 1

    # Display the list
    print("Fixed Stack-Dynamic Array:")
    print(arr)

fixed_stack_dynamic()
