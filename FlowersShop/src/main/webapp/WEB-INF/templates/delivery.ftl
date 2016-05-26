<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Доставка</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>

    <link href="/css/templatemo_style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="/css/orman.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="/css/nivo-slider.css" type="text/css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="/css/ddsmoothmenu.css"/>

    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <script type="text/javascript" src="/js/ddsmoothmenu.js"></script>


    <script type="text/javascript">

        ddsmoothmenu.init({
            mainmenuid: "templatemo_menu", //menu DIV id
            orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
            classname: 'ddsmoothmenu', //class added to menu's outer DIV
            //customtheme: ["#1c5a80", "#18374a"],
            contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
        });

        function clearText(field) {
            if (field.defaultValue == field.value) field.value = '';
            else if (field.value == '') field.value = field.defaultValue;
        }

    </script>

</head>

<body>

<div id="templatemo_wrapper_sp">
    <div id="templatemo_header_wsp">
        <div id="templatemo_header" class="header_subpage">

        <#if admin??>
            <p class="logreg"><a href="/admin_messages" class="loginregister" title="Управление">Управление</a></p>
        </#if>

        <#if username??>
            <p class="logreg"><a href="/logout" class="loginregister" title="Выход">Выход</a></p>
        <#else >
            <p class="logreg"><a href="/login" class="loginregister" title="Вход">Вход</a> ||
                <a href="/registration" class="loginregister" title="Регистрация">Регистрация</a></p>
        </#if>


            <p class="logreg"><a href="/shopping_cart" class="loginregister" title="Корзина">Корзина</a></p>


            <div id="site_title"><a href="#">Floris</a></div>
            <div id="templatemo_menu" class="ddsmoothmenu">
                <ul>
                    <li><a href="/">Главная</a></li>
                    <li><a href="/about_flowers">О цветах</a></li>
                    <li><a href="/products">Цветы</a>
                        <ul>
                            <li><a href="/products">Все</a></li>
                            <li><a href="/private_adv">Частные объявления</a></li>
                            <li><a href="/add_product">Добавить товар</a></li>
                        </ul>
                    </li>
                    <li><a href="/delivery" class="selected">Доставка</a></li>
                    <li><a href="/contacts">Контакты</a></li>
                    <li><a href="/faq">FAQ</a></li>
                </ul>

                <br style="clear: left"/>
            </div>
            <!-- end of templatemo_menu -->

        </div>
        <!-- END of header -->
    </div>
    <!-- END of header wrapper -->
    <div id="templatemo_main_wrapper">
        <div id="templatemo_main">
            <div id="sidebar" class="left">
                <div class="sidebar_box"><span class="bottom"></span>

                    <h3>Цветы</h3>

                    <div class="content">
                        <ul class="sidebar_list">
                        ${menu}
                        </ul>
                    </div>
                </div>

                <div class="sidebar_box"><span class="bottom"></span>

                    <h3>Спецпредложение</h3>

                    <div class="content special">
                        <img src="/images/product/${saleimg}.jpg" alt="Flowers" width="220" height="220"/>
                        <a href="#">${salename} ${saletype}</a>

                        <p>
                            Цена:
                            <span class="price normal_price">${oldprice} руб</span>&nbsp;&nbsp;
                            <span class="price special_price">${newprice} руб</span>
                        </p>
                    </div>
                </div>
            </div>

            <div id="content" class="right">
                <h2>Доставка</h2>

            <#if msg??>
                <h3>${msg}</h3>

                <div align="center">
                    </br>
                    </br>
                    </br>
                    <h5><a href="/generate/deliveryDetails.htm?">Загрузить детали заказа в формате PDF</a></h5>
                </div>

            <#else>



                <h3>Детали заказа</h3>

                <@sf.form action="/delivery" method="post" modelAttribute="delform" id="delform">
                    <div class="content_half left form_field" align="left">
                        <h5>Фамилия (как на кредитной карте):</h5>
                        <@sf.input path="secondname" name="secondname" type="text" id="secondname" maxlength="40" autofocus="autofocus"/>
                        <h6 style="color: #ff0000"><@sf.errors path="secondname" cssClass="error" delimiter=" "/></h6>

                        <br/>
                        <h5>Имя (как на кредитной карте):</h5>
                        <@sf.input path="name" name="name" type="text" id="name" maxlength="40"/>
                        <h6 style="color: #ff0000"><@sf.errors path="name" cssClass="error" delimiter=" "/></h6>

                        <br/>
                        <h5>Отчество:</h5>
                        <@sf.input path="lastname" name="lastname" type="text" id="lastname" maxlength="40"/>
                        <h6 style="color: #ff0000"><@sf.errors path="lastname" cssClass="error" delimiter=" "/></h6>

                        <br/>
                        <h5>Страна:</h5>
                        <@sf.input path="country" name="country" type="text" id="country" maxlength="40"/>
                        <h6 style="color: #ff0000"><@sf.errors path="country" cssClass="error" delimiter=" "/></h6>

                        <br/>
                        <h5>Город:</h5>
                        <@sf.input path="city" name="city" type="text" id="city" maxlength="40"/>
                        <h6 style="color: #ff0000"><@sf.errors path="city" cssClass="error" delimiter=" "/></h6>

                        <br/>
                        <h5>Улица:</h5>
                        <@sf.input path="street" name="street" type="text" id="street" maxlength="40"/>
                        <h6 style="color: #ff0000"><@sf.errors path="street" cssClass="error" delimiter=" "/></h6>

                        <br/>
                        <h5>Дом:</h5>
                        <@sf.input path="house" name="house" type="text" id="house" maxlength="40"/>
                        <h6 style="color: #ff0000"><@sf.errors path="house" cssClass="error" delimiter=" "/></h6>

                        <br/>
                        <h5>Квартира:</h5>
                        <@sf.input path="flat" name="flat" type="text" id="flat" maxlength="40"/>
                        <h6 style="color: #ff0000"><@sf.errors path="flat" cssClass="error" delimiter=" "/></h6>
                    </div>

                    <div class="content_half right" align="right">
                        <div class="form_field" align="left">
                            <h5>Номер телефона:</h5>
                            <@sf.input path="phone" name="phone" type="text" id="phone" maxlength="40"/>
                            <span>Пожалуйста, укажите ваш доступный номер телефона для связи с вами.</span>
                            <h6 style="color: #ff0000"><@sf.errors path="phone" cssClass="error" delimiter=" "/></h6>

                        <br/>
                    </div>
                    <input class="login" type="submit" value="Заказать"/>
                    </div>

                </@sf.form>
            </#if>


                <div class="cleaner h40"></div>

            </div>

            <div class="cleaner"></div>
        </div>
        <!-- END of main -->
    </div>
    <!-- END of main wrapper -->

    <div id="templatemo_footer_wrapper">
        <div id="templatemo_footer">
            <div class="footer_left">
                <a href="#"><img src="images/1311260370_paypal-straight.png" alt="Paypal"/></a>
                <a href="#"><img src="images/1311260374_mastercard-straight.png" alt="Master"/></a>
                <a href="#"><img src="images/1311260374_visa-straight.png" alt="Visa"/></a>
            </div>
            <div class="footer_right">
                <p><a href="/">Главная</a> | <a href="/about_flowers">О цветах</a> | <a href="/products">Цветы</a>
                    | <a href="/delivery">Доставка</a> | <a href="/contacts">Контакты</a> | <a href="/faq">FAQ</a>
                </p>

                <p>Copyright © 2016 <a href="#">Floris</a></p>
            </div>
            <div class="cleaner"></div>
        </div>
        <!-- END of footer -->
    </div>
    <!-- END of footer wrapper -->
</div>

</body>
</html>