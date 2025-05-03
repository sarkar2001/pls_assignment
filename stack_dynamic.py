def stack_dynamic():
    size = int(input("Enter size of array: "))  # size determined at runtime

    arr = [0] * size  # create fixed-size list on stack

    # Assign values
    for i in range(size):
        arr[i] = (i + 1) * 2

    # Display the array
    print("Stack-Dynamic Array:")
    print(arr)


stack_dynamic()
