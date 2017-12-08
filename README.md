# student-information-system
传统spring+jsp，学生信息管理系统


基本要求：
1）用户管理：系统分为3级用户权限：超级管理员可以录入学院信息和专业信息、班级信息、学生信息；普通管理员只能录入学生信息；普通用户只能查看学生信息。超级管理员可以添加和管理普通管理员；普通管理员能够修改个人信息，如密码、所属学院等。普通用户不用注册，可以直接查看系统。
2）后台学生信息管理：超级管理员可以对学院信息、学院所含专业信息和专业所分的班级信息以及每个班的学生信息进行增删改查。普通管理员可以对班级的学生信息进行增删改查。
3）前台学生信息查询：要求根据学号或姓名查出学生的所有信息（学院、专业、班级、姓名、学号、联系电话、宿舍楼号、宿舍号等）

扩展要求：
1）实现普通管理员按学院划分权限，某个学院的管理员只能管理本学院的学生信息。
2）实现学生信息的高级查询。例如可以按宿舍查，按联系电话查或组合条件查询。
3）实现学生信息的批量导入。例如使用excel文件导入批量信息。

（五）实现的功能：
1)三个用户权限登陆（超级管理员，普通管理员，普通用户）；
2)普通用户只能查看个人信息（输入对应的学号和联系电话进行查看）；
3)普通管理员增加、查找、修改、删除学生信息（学号、姓名、学院、专业、年级、班级、联系电话、宿舍号、登陆账户、密码）；
4)超级管理员增加、查找、修改、删除学生信息、班级信息（班级名称、年级、班级人数、宿舍、班主任、辅导员）、专业信息（专业名称、专业简介、专业人数、班级数量）、学院信息（学院名称、学院简介、院长、办公室）；
5)超级管理员能够显示和删除普通管理员的信息（用户名、密码）；
6)超级管理员能够修改密码（修改当前用户的密码）；
7)普通管理员能够修改普通用户（学生）的密码； 


代码结构：
1.有关数据库链接的文件：DBconnection.java
2.有关登陆功能的文件：Jlogin.java、LoginServlet1.java、GLogin.jsp、SLogin.jsp、Mainlogin.jsp、
3.有关学生信息增删改查的文件：StudentDao.java、StudentMessage.java、Stuquery.java、DeletestuServlet.java、InsertstuServlet1.java、UpdatestuServlet.java、Stu.jsp、Deletestu.jsp、Insertstu.jsp、Selectupstu.jsp、Student.jsp
4.有关学院信息增删改查的文件：College.java、MajorCollegeMessage.java、DeletecollegeServlet.java、InsertcollegeServlet.java、UpdatecollegeServlet.java、Col.jsp、Deletecollege.jsp、Insertcollege.jsp、Selectupcollege.jsp
5.有关班级信息增删改查的文件：SClass.java、ClassMessage.java、DeleteclassServlet.java、InsertclassServlet.java、UpdateclassServlet.java、Cla.jsp、Deleteclass.jsp、Insertclass.jsp、Selectupclass.jsp
6.有关专业信息增删改查的文件：Major.java、MajorCollegeMessage.java、DeletemajorServlet.java、InsertmajorServlet.java、UpdatemajorServlet.java、Maj.jsp、Deletemajor.jsp、Insertmajor.jsp、Selectupmajor.jsp
7.有关密码修改的文件：user.java、Jlogin.java、NewpwdServlet.java、Newpwd.jsp
8.有关显示和删除普通管理员信息的文件：Ordinary.java、OrdinaryMessage.java、GuanliyuanServlet.java、SGuanliyuan.jsp
9.系统主界面：Mainlogin.jsp
10.超级管理员的主菜单：SuperMain.jsp
11.普通管理员的主菜单：OrdinaryMain.jsp
