@.str = private unnamed_addr constant [3 x i8] c"%d ", align 1 
; Function Attrs: noinline nounwind optnone uwtable 
define dso_local i32 @main() #0 { 
%1 = alloca i32, align 4
store i32 10, i32* %1, align 4
%2 = alloca i32, align 4
store i32 5, i32* %2, align 4
%3 = alloca i32, align 4
store i32 10, i32* %3, align 4
%4 = alloca i32, align 4
store i32 3, i32* %4, align 4
%5 = alloca i32, align 4
store i32 2, i32* %5, align 4
%6 = alloca i32, align 4
%6 = mul i32 null, %5
%7 = alloca i32, align 4
%7 = add i32 null, null
}
declare dso_local i32 @printf(i8*, ...) #1
