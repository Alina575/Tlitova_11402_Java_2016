<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>О цветах</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <link href="/rs/css/templatemo_style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="/rs/css/orman.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="/rs/css/nivo-slider.css" type="text/css" media="screen"/>
    <link rel="stylesheet" type="text/css" href="/rs/css/ddsmoothmenu.css"/>

    <script type="text/javascript" src="/rs/js/jquery.min.js"></script>
    <script type="text/javascript" src="/rs/js/ddsmoothmenu.js"></script>

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

            <p class="logreg"><a href="/login" class="loginregister" title="Вход">Вход</a> ||
                <a href="/registration" class="loginregister" title="Регистрация">Регистрация</a></p>

            <p class="logreg"><a href="/shopping_cart" class="loginregister" title="Корзина">Корзина</a></p>


            <div id="site_title"><a href="#">Floris</a></div>
            <div id="templatemo_menu" class="ddsmoothmenu">
                <ul>
                    <li><a href="/">Главная</a></li>
                    <li><a href="/about_flowers">О цветах</a></li>
                    <li><a href="/products/all" class="selected">Цветы</a>
                        <ul>
                            <li><a href="/products/all">Все</a></li>
                            <li><a href="/private_adv">Частные объявления</a></li>
                            <li><a href="/add_product">Добавить товар</a></li>
                        </ul>
                    </li>
                    <li><a href="/delivery">Доставка</a></li>
                    <li><a href="/contacts">Контакты</a></li>
                    <li><a href="/faq">FAQ</a></li>
                </ul>
                <div id="templatemo_search">
                    <form action="#" method="get">
                        <input type="text" value="Поиск" name="keyword" id="keyword" title="keyword"
                               onfocus="clearText(this)" onblur="clearText(this)" class="txt_field"/>
                        <input type="submit" name="Search" value="" alt="Search" id="searchbutton" title="Search"
                               class="sub_btn"/>
                    </form>
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
                            <li><a href="/products/{name}">Розы</a></li>
                            <li><a href="/products/{name}">Тюльпаны</a></li>
                            <li><a href="/products/{name}">Орхидеи</a></li>
                            <li><a href="/products/{name}">Гвоздики</a></li>
                            <li><a href="/products/{name}">Ирисы</a></li>
                            <li><a href="/products/{name}">Хризантемы</a></li>
                            <li><a href="/products/{name}">Альстромерии</a></li>
                            <li><a href="/products/{name}">Другие</a></li>
                        </ul>
                    </div>
                </div>

                <div class="sidebar_box"><span class="bottom"></span>

                    <h3>Букеты</h3>

                    <div class="content">
                        <ul class="sidebar_list">
                            <li><a href="#">С розами</a></li>
                            <li><a href="#">С тюльпанами</a></li>
                            <li><a href="#">С орхидеями</a></li>
                            <li><a href="#">С гвоздиками</a></li>
                            <li><a href="#">С ирисами</a></li>
                            <li><a href="#">С хризантемами</a></li>
                            <li><a href="#">Свадебные</a></li>
                            <li><a href="#">Другие</a></li>
                        </ul>
                    </div>
                </div>
                <div class="sidebar_box"><span class="bottom"></span>

                    <h3>Спецпредложение</h3>

                    <div class="content special">
                        <img src="/rs/images/templatemo_image_01.jpg" alt="Flowers"/>
                        <a href="#">Citrus Burst Bouquet</a>

                        <p>
                            Цена:
                            <span class="price normal_price">$160</span>&nbsp;&nbsp;
                            <span class="price special_price">$100</span>
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
                        <th width="60" align="center">Количество</th>
                        <th width="70" align="center"></th>
                    </tr>
                </table>

                <div class="cleaner h20"></div>

                <form action="#" method="get">
                    <table width="700" border="0" cellpadding="5" cellspacing="0">
                    <tr bgcolor="#41581B">
                            <td width="80" align="center">Роза</td>
                            <td width="60" align="center">Белая</td>
                            <td width="60" align="center">100</td>
                            <td width="60" align="center">Кто-то</td>
                            <td width="60" align="center"><input type="text" name="quantity" value="1" size="5"
                                                                 maxlength="2"/></td>
                            <td width="50" align="center"><input type="submit" value="В корзину"/></td>
                    </tr>
                </table>
                </form>

                <table width="700" border="0" cellpadding="5" cellspacing="0">
                    <tr bgcolor="#41581B">
                        <td>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque quis nulla id orci
                            malesuada porta posuere quis massa. Nunc vitae purus non augue scelerisque ultricies vitae
                            et velit
                            quis nulla id orci malesua.
                        </td>
                    </tr>
                </table>

                <div class="cleaner h20"></div>

                <table width="700" border="0" cellpadding="5" cellspacing="0">
                    <tr bgcolor="#41581B">
                        <td width="80" align="center">Роза</td>
                        <td width="60" align="center">Белая</td>
                        <td width="60" align="center">100</td>
                        <td width="60" align="center">Кто-то</td>
                        <td width="60" align="center"><input name="quantity" type="text" value="1" size="5"
                                                             maxlength="2"/></td>
                        <td width="50" align="center"><input type="submit" value="В корзину"/></td>
                    </tr>
                </table>

                <table width="700" border="0" cellpadding="5" cellspacing="0">
                    <tr bgcolor="#41581B">
                        <td>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque quis nulla id orci
                            malesuada porta posuere quis massa. Nunc vitae purus non augue scelerisque ultricies vitae
                            et velit
                            quis nulla id orci malesua.
                        </td>
                    </tr>
                </table>


            </div>
            <div class="cleaner"></div>
        </div>
        <!-- END of main -->
    </div>
    <!-- END of main wrapper -->

    <div id="templatemo_footer_wrapper">
        <div id="templatemo_footer">
            <div class="footer_left">
                <a href="#"><img src="/rs/images/1311260370_paypal-straight.png" alt="Paypal"/></a>
                <a href="#"><img src="/rs/images/1311260374_mastercard-straight.png" alt="Master"/></a>
                <a href="#"><img src="/rs/images/1311260374_visa-straight.png" alt="Visa"/></a>
            </div>
            <div class="footer_right">
                <p><a href="/">Главная</a> | <a href="/about_flowers">О цветах</a> | <a href="/products/all">Цветы</a>
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