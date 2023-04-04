วิธีติดตั้ง เเละ วิธีใช้งาน

------  วิธีติดตั้งโปรเจค ------

1.Download โปรเจคมาจาก Github -> zignalssss/RandomRestarauntProject (github.com) or http://bit.ly/40Exmrs

2.แตกไฟล์ที่โหลดมาเมื่อแตกไฟล์แล้วในFolderโปรเจคจะมีอยู่ 4 ไฟล์ โดยจะมีส่วนประกอบดังนี้
	2.1.src 
	2.2.JarFile 
	2.3.Kanit-Light.ttf 
	2.4. RestaurantsData.xlsx
3.Copy ไฟล์ src , Kanit-Light.ttf , RestarantsData.xlsx ไปใส่ในProjectที่สร้างไว้ใน IntelliJ IDEA

4.เปิด IntelliJ IDEA แล้วคลิกที่ 
      File -> Project Structure -> Modules -> Dependencies -> add “+” , -> JARs or Directories , 
      Copy Path จาก JarFile ใน Folderโปรเจคที่ได้แตกไฟล์ไว้ จากนั้นเลือกไฟล์ .jar ทั้งหมด 5 ไฟล์แล้วกด OK
      จากนั้นทำการเลือก 5 ไฟล์แล้วกด Apply

--------- วิธีติดตั้งใช้งาน -------

1.Page1
	ในส่วนหน้าเเรกหน้านี่จะใช้สำหรับสุ่มร้านอาหารตามเวลาปัจุบันโดยส่วนนี้จะมีหลักๆ2ปุ่มโดยปุ่มRandomจะทำการสุ่มIndexและนำไปเรียก
	HashMapและนำรูปภาพที่เป็นValueของHashMapมาsetIconและปุ่ม Check เมื่อกดจะทำการเปลี่ยนหน้าไปยัง Page 2
2.Page2
	หน้านี่จะใช้สำหรับแสดงผลว่าร้านไหนเปิดและร้านไหนปิดบ้าง โดยทางซ้ายจะแสดงผลร้านที่เปิดและทางขวาจะแสดงผลร้านที่ปิด
