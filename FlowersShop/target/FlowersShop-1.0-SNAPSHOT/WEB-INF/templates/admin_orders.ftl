<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Заказы клиентов</title>

    <link href="css/templatemo_style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="css/orman.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="css/ddsmoothmenu.css"/>

    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/ddsmoothmenu.js"></script>

    <link rel="stylesheet" href="css/slimbox2.css" type="text/css" media="screen"/>
    <script type="text/JavaScript" src="js/slimbox2.js"></script>

</head>

<body>


<div id="templatemo_wrapper_h">
    <div id="templatemo_header_wh">
        <div id="templatemo_header" class="header_home">

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
                    <li><a href="/delivery">Доставка</a></li>
                    <li><a href="/contacts">Контакты</a></li>
                    <li><a href="/faq">FAQ</a></li>
                </ul>

                <br style="clear: left"/>
            </div>
            <!-- end of templatemo_menu -->

            <div class="slider-wrapper theme-orman">
                <div id="slider" class="nivoSlider">
                    <img src="images/portfolio/01.jpg" alt="slider image 1"/>
                    <a href="#">
                        <img src="images/portfolio/02.jpg" alt="slider image 2" title="Любые цветы на ваш вкус!"/>
                    </a>
                    <img src="images/portfolio/03.jpg" alt="slider image 3"/>
                    <img src="images/portfolio/04.jpg" alt="slider image 4" title="#htmlcaption"/>
                    <img src="images/portfolio/05.jpg" alt="slider image 5" title="#htmlcaption"/>
                </div>

            </div>
            <script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
            <script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>

        </div>
        <!-- END of header -->
    </div>
    <!-- END of header wrapper -->


    <div id="templatemo_main_wrapper">
        <div id="templatemo_main">
            <div id="sidebar" class="left">
                <div class="sidebar_box"><span class="bottom"></span>

                    <h3>Разделы</h3>

                    <div class="content">
                        <ul class="sidebar_list">
                            <li><a href="/admin_messages">Сообщения клиентов</a></li>
                            <li><a href="/admin_orders">Заказы клиентов</a></li>
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
                <h2>Заказы клиентов</h2>

            <#if orders?has_content>
                <table width="700" border="0" cellpadding="5" cellspacing="0">
                    <tr bgcolor="#395015">
                        <th width="80" align="center">Пользователь</th>
                        <th width="60" align="center">Номер</th>
                        <th width="60" align="center">Дата заказа</th>
                        <th width="60" align="center">Наименование</th>
                        <th width="60" align="center">Тип</th>
                        <th width="60" align="center">Количество</th>
                    </tr>
                </table>

                <div class="cleaner h20"></div>

                <#list orders as o>

                    <table width="700" border="0" cellpadding="5" cellspacing="0">
                        <tr bgcolor="#41581B">
                            <td width="80" align="center">${o.user.login}</td>
                            <td width="60" align="center">${o.user.phone}</td>
                            <td width="60" align="center">${o.date}</td>
                            <td width="60" align="center">${o.flower.name}</td>
                            <td width="60" align="center">${o.flower.type}</td>
                            <td width="60" align="center">${o.quantity}</td>
                        </tr>
                    </table>

                    <div class="cleaner h20"></div>

                </#list>

            <#else>
                <p>Ни одного заказа не найдено!</p>
            </#if>


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