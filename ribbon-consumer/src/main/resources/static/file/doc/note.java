
//上传github仓库
1.git status
2.git add .
3.git commit -m 'change databse'
4.git remote add origin https://github.com/weilinhui/cloudcode.git
  (如果报错remote origin already exists. 先执行 git remote rm origin )
5.git push -u origin master



//Spring : Spring加载配置文件classpath、classpath*、file解析
前缀		说明
1. classpath	 //优先本项目class路径查找,没有的话依次在其他jar包中class路径查找,找到第一个匹配的为止  <context:property-placeholder location="classpath:system.properties" />
2. classpath* //加载到所有class路径下的配置文件,包括jar包的class路径下,最终加载所有匹配的 		    <context:property-placeholder location="classpath*:system.properties" />
3. file		 //通过URL加载,来源为文件系统（注意文件读取权限）        		   		   		   		<context:property-placeholder location="file:/Users/weilinhui/system.properties" />
4. http		 //通过URL加载,来源为网络


//查看系统中文件的使用情况
1. df -h
//查看当前目录下各个文件及目录占用空间大小
2. du -sh *
//输出日志
3. tail -n 1000 catalina.out  >test1.txt


		
/** 表情包 */
http://www.bee-ji.com
/** 壁纸 */
http://www.netbian.com/heise/index_2.htm

//删除站点归属处理重复记录（保留最大的一条）
delete FROM zm_shop_check
WHERE f_check_num IN ( SELECT f_check_num FROM zm_shop_check GROUP BY f_check_num HAVING count(1) > 1 )  //查所有重复的
and f_id not in (select max(f_id) from zm_shop_check group by f_check_num HAVING count(1) > 1);   //不包含最大的

//生产_修改站点名称
http://www.zuma.com/shop_web/shopInfo/update?fId=1889&fIsDel=1

//根据条件显示隐藏
style='<c:if test="${(BasicInfo.fShopType eq 'PARTY_AND_GOVERNMENT')||(BasicInfo.fShopType eq 'INSTITUTION')}">display:none;</c:if>'

//根据href的内容like取值
$('.leftsite-box li [href*="'+refStr+'"]').children(".tit").addClass("active");

//因为默认访问规则的限制,Windows Apps 在默认状态下无法访问本地回环端口。
//需要以管理员方式在 cmd  使用如下命令可解除 Edge 浏览器访问 localhost 限制:
CheckNetIsolation LoopbackExempt -a -n=Microsoft.MicrosoftEdge_8wekyb3d8bbwe

//点击空白处不关闭遮罩层
modal(模态框)  data-backdrop="static"

// 服务订单合并payLog
select t1.f_id,t1.f_order_id,t1.f_amend,t1.f_type,t1.f_msg,t1.f_pay_no,t1.f_method,t1.f_state,t1.f_details,t1.f_createTime,
t2.f_refund_type,t2.f_amend as f_refund_amend,t2.f_state as f_refund_state from
(select * from zm_shop_order_pay_log where (f_refund_type is null or  f_complain_amend is not null ) and f_order_id = 7137 ) t1
left   JOIN
(SELECT * FROM zm_shop_order_pay_log where f_refund_type is not null  and f_complain_amend is null ) t2 on  t1.f_pay_no=t2.f_pay_no

// 1.保存object1和2合并后产生新对象,若2中有与1相同的key,默认2将会覆盖1的值
var object = $.extend({}, object1, object2);
// 2.将2的值合并到1,同key时 默认2将会覆盖1的值
$.extend( object1, object2 );

//bin目录elasticsearch.bat启动
访问地址: http://localhost:9200/
打开可视化工具: elasticsearch-head-master目录下 npm run start
可视化管理地址: http://localhost:9100/





http://www.runoob.com/linux/nginx-install-setup.html

安装编译工具及库文件
yum -y install make zlib zlib-devel gcc-c++ libtool  openssl openssl-devel

PCRE 作用是让 Nginx 支持 Rewrite 功能
1. 下载 PCRE 安装包,下载地址: http://downloads.sourceforge.net/project/pcre/pcre/8.35/pcre-8.35.tar.gz
[root@bogon src]# cd /usr/local/src/
[root@bogon src]# wget http://downloads.sourceforge.net/project/pcre/pcre/8.35/pcre-8.35.tar.gz
2. 解压安装包:
[root@bogon src]# tar zxvf pcre-8.35.tar.gz
3. 进入安装包目录
[root@bogon src]# cd pcre-8.35
4. 编译安装
[root@bogon pcre-8.35]# ./configure
[root@bogon pcre-8.35]# make && make install
5. 查看pcre版本
[root@bogon pcre-8.35]# pcre-config --version

安装 Nginx
1. 下载 Nginx,下载地址:http://nginx.org/download/nginx-1.6.2.tar.gz
[root@bogon src]# cd /usr/local/src/
[root@bogon src]# wget http://nginx.org/download/nginx-1.6.2.tar.gz

进入nginx目录 编译nginx
./configure --prefix=/opt/java/nginx --with-http_stub_status_module --with-http_ssl_module --with-pcre=/opt/java/pcre-8.35



Linux文件上传下载,rz和sz
yum安装方式
在联网的情况下,执行以上命令即可:yum install -y lrzsz
rz/ sz 命令的使用 :rz 上传命令      sz 下载命令
