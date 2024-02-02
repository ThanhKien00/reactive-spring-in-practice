# Reactive Spring

## Hiểu về lập trình phản ứng
_Lập trình phản ứng_ (Reactive Programming) là một mô hình lập trình bất đồng bộ, tập trung vào việc xử lý các dòng dữ liệu (streams of data), bản chất của nó là lập trình hướng hàm
và hướng khai báo. Thay vì mô tả một tập các bước sẽ được thực hiện tuần tự, lập trình phản ứng bao gồm việc mô tả một đường ống (hay stream) mà dữ liệu sẽ chảy qua. Thay vì yêu cầu
dữ liệu phải có sẵn và phải xử lý tổng thể, thì một dòng phản ứng (Reactive Stream) sẽ xử lý dữ liệu khi có sẵn. Trong các dự án thực tế, có những dòng dữ liệu chảy đến một cách vô tận.

"_Các chương trình phản ứng duy trì sự tương tác với môi trường của chúng, nhưng với tốc độ được xác định bởi môi trường chứ không phải bản thân các chương trình đó. Các chương trình
tương tác (Interactive Programs) hoạt động theo tốc độ của riêng chúng và chủ yếu giải quyết các vấn đề về giao tiếp trong khi các chương trình phản ứng hoạt động để đáp ứng nhu cầu 
từ bên ngoài và chủ yếu xử lý việc ngắt. Các chương trình thời gian thực thường mang tính phản ứng_" _Gerad Berry. 