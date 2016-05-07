<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Контакты</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>

    <script src="/rs/js/jquery-2.1.4.js"></script>
    <script type="text/javascript" src="/rs/js/jquery-2.1.4.js"></script>
    <script src="//ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/sunny/jquery-ui.css">

    <script type="text/javascript">
        function() {
            var tp = ["Пожелание", "Сотрудничество", "Жалоба", "Благодарность"];
            $('#theme').autocomplete({
                source: tp
            })
        });
    </script>

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
                    <li><a href="/products/all">Цветы</a>
                        <ul>
                            <li><a href="/products/all">Все</a></li>
                            <li><a href="/private_adv">Частные объявления</a></li>
                            <li><a href="/add_product">Добавить товар</a></li>
                        </ul>
                    </li>
                    <li><a href="/delivery">Доставка</a></li>
                    <li><a href="/contacts" class="selected">Контакты</a></li>
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
                <h2>Контакты</h2>

                <p>Morbi adipiscing gravida lacus, id rhoncus neque sollicitudin ac. Sed eget purus vitae enim pulvinar
                    viverra. Cras ut elit et ligula blandit eleifend. Nam at odio sem, sed tempor justo.</p>

                <div class="cleaner h20"></div>
                <div class="col col13">
                    <h4>Mailing Address</h4>
                    <h6><strong>Office One</strong></h6>
                    800-220 Fusce nec ante at odio, <br/>
                    In vitae lacus in purus, 66770<br/>
                    Diam a mollis tempor<br/><br/>

                    <strong>Phone:</strong> 010-440-5500<br/>
                    <strong>Email:</strong> <a href="mailto:contact@company.com">contact@company.com</a> <br/>

                    <div class="cleaner h20"></div>

                    <h6><strong>Office Two</strong></h6>
                    600-110 Duis lacinia, <br/>
                    Ullamcorper mattis, 88770<br/>
                    Maecenas a diam, mollis magna<br/><br/>

                    <strong>Phone:</strong> 020-660-8800<br/>
                    <strong>Email:</strong> <a href="mailto:info@company.com">info@company.com</a> <br/>

                    Validate <a href="http://validator.w3.org/check?uri=referer"
                                rel="nofollow"><strong>XHTML</strong></a> &amp; <a
                        href="http://jigsaw.w3.org/css-validator/check/referer" rel="nofollow"><strong>CSS</strong></a>
                </div>
                <div class="col col23 no_margin_right">
                    <div class="map_border">
                        <iframe width="430" height="340" frameborder="0" scrolling="no" marginheight="0" marginwidth="0"
                                src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Central+Park,+New+York,+NY,+USA&amp;aq=0&amp;sll=14.093957,1.318359&amp;sspn=69.699334,135.263672&amp;vpsrc=6&amp;ie=UTF8&amp;hq=Central+Park,+New+York,+NY,+USA&amp;ll=40.778265,-73.96988&amp;spn=0.033797,0.06403&amp;t=m&amp;output=embed"></iframe>
                    </div>

                </div>
                <div class="cleaner h40"></div>
                <div id="contact_form">
                    <form method="post" name="contact" action="#">
                        <div class="col col13">
                            <h6><strong>Здесь вы можете оставить ваше сообщение.</strong></h6>
                            </br>

                            <label>Тема:</label>
                            <input name="theme" type="text" class="input_field" id="theme" maxlength="40"/>

                            <div class="cleaner h10"></div>
                            <span>Пожалуйста, укажите тему для более быстрой обработки заявки.</span>

                        </div>

                        <div class="col col23 no_margin_right">
                            <label for="message">Сообщение:</label>
                            <textarea id="message" name="message" rows="0" cols="0" class="required"></textarea>

                            <div class="cleaner h10"></div>
                            <input type="submit" class="submit_btn submit_right" name="submit" id="submit"
                                   value="Отправить"/>
                        </div>


                    </form>
                </div>
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
                <a href="#"><img src="/rs/images/1311260370_paypal-straight.png" alt="Paypal"/></a>
                <a href="#"><img src="/rs/images/1311260374_mastercard-straight.png" alt="Master"/></a>
                <a href="#"><img src="/rs/images/1311260374_visa-straight.png" alt="Visa"/></a>
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