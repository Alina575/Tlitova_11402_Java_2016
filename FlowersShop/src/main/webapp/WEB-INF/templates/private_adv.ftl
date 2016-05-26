<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>О цветах</title>
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
                    <li><a href="/products" class="selected">Цветы</a>
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
                <div id="templatemo_search">

                </div>
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
                <h2>Частные объявления</h2>

                <table width="700" border="0" cellpadding="5" cellspacing="0">
                    <tr bgcolor="#395015">
                        <th width="80" align="center">Название</th>
                        <th width="60" align="center">Тип</th>
                        <th width="60" align="center">Цена, руб</th>
                        <th width="60" align="center">Продавец</th>
                        <th width="60" align="center">Номер</th>
                        <th width="70" align="center">Дата</th>
                    </tr>
                </table>

                <div class="cleaner h20"></div>

            <#list products as p>

                    <table width="700" border="0" cellpadding="5" cellspacing="0">
                        <tr bgcolor="#41581B">
                            <td width="80" align="center">${p.name}</td>
                            <td width="60" align="center">${p.type}</td>
                            <td width="60" align="center">${p.price}</td>
                            <td width="60" align="center">${p.user.login}</td>
                            <td width="60" align="center">${p.user.phone}</td>
                            <td width="60" align="center">${p.date}</td>
                        </tr>
                    </table>

                <table width="700" border="0" cellpadding="5" cellspacing="0">
                    <tr bgcolor="#41581B">
                        <td>${p.descr}</td>
                    </tr>
                </table>

                <div class="cleaner h20"></div>

            </#list>




            </div>
            <div class="cleaner"></div>
        </div>
    </div>

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
    </div>
</div>

</body>
</html>