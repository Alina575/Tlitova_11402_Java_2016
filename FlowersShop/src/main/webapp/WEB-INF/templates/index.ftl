<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Главная</title>
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

    <link rel="stylesheet" href="/rs/css/slimbox2.css" type="text/css" media="screen"/>
    <script type="text/JavaScript" src="/rs/js/slimbox2.js"></script>

</head>

<body>


<div id="templatemo_wrapper_h">
    <div id="templatemo_header_wh">
        <div id="templatemo_header" class="header_home">

            <p class="logreg"><a href="/login" class="loginregister" title="Вход">Вход</a> ||
                <a href="/registration" class="loginregister" title="Регистрация">Регистрация</a></p>

            <p class="logreg"><a href="/shopping_cart" class="loginregister" title="Корзина">Корзина</a></p>


            <div id="site_title"><a href="#">Floris</a></div>
            <div id="templatemo_menu" class="ddsmoothmenu">
                <ul>
                    <li><a href="/" class="selected">Главная</a></li>
                    <li><a href="/about_flowers">О цветах</a></li>
                    <li><a href="/products/all">Цветы</a>
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

            <div class="slider-wrapper theme-orman">
                <div id="slider" class="nivoSlider">
                    <img src="/rs/images/portfolio/01.jpg" alt="slider image 1"/>
                    <a href="#">
                        <img src="/rs/images/portfolio/02.jpg" alt="slider image 2" title="Любые цветы на ваш вкус!"/>
                    </a>
                    <img src="/rs/images/portfolio/03.jpg" alt="slider image 3"/>
                    <img src="/rs/images/portfolio/04.jpg" alt="slider image 4" title="#htmlcaption"/>
                    <img src="/rs/images/portfolio/05.jpg" alt="slider image 5" title="#htmlcaption"/>
                </div>

            </div>
            <script type="text/javascript" src="/rs/js/jquery-1.6.1.min.js"></script>
            <script type="text/javascript" src="/rs/js/jquery.nivo.slider.pack.js"></script>
            <script type="text/javascript">
                $(window).load(function () {
                    $('#slider').nivoSlider({
                        controlNav: false
                    });
                });
            </script>
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
                <h2>Добро пожаловать в цветочный магазин Floris!</h2>

                <p>Floral Shop is free website template by templatemo. Sed in suscipit risus, eget consectetur justo.
                    Praesent lacinia, nisi quis commodo consectetur, diam magna laoreet felis, a pulvinar mauris enim in
                    felis. Phasellus in mauris velit. In pellentesque massa in nisl auctor pellentesque. Donec fermentum
                    convallis purus, id luctus nulla tempus in. Aliquam diam nibh, consectetur quis fringilla facilisis,
                    egestas sed odio. Validate <a href="http://validator.w3.org/check?uri=referer"
                                                  rel="nofollow"><strong>XHTML</strong></a> &amp; <a
                            href="http://jigsaw.w3.org/css-validator/check/referer" rel="nofollow"><strong>CSS</strong></a>.
                </p>


            </div>
            <div class="cleaner"></div>
        </div>
        <!-- END of main -->
    </div>
    <!-- END of main wrapper -->
    <a class="btn btn-action btn-lg" role="button" href="generate/pdf.htm">DOWNLOAD ONE FREE COMICS</a>
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