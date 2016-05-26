<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>FAQ</title>
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
                    <li><a href="/delivery">Доставка</a></li>
                    <li><a href="/contacts">Контакты</a></li>
                    <li><a href="/faq" class="selected">FAQ</a></li>
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

            <div id="content" class="right faqs">
                <h2>FAQs</h2>
                <h5>How do I know if my order has been placed?</h5>

                <p>You will receive an email confirming that your order has been received. If you do not receive an
                    email confirmation, please login to see your order status. Validate <a
                            href="http://validator.w3.org/check?uri=referer" rel="nofollow"><strong>XHTML</strong></a>
                    &amp; <a href="http://jigsaw.w3.org/css-validator/check/referer" rel="nofollow"><strong>CSS</strong></a>.
                </p>

                <h5>When will my order be shipped?</h5>

                <p>Please read our shipping policy. Click <a href="#">here</a></p>

                <h5>What payment methods do you accept?</h5>

                <p>PayPal and 2Checkout (2CO)</p>

                <h5>Can I return or exchange my purchase if I don't like it?</h5>

                <p>Please read our exchange policy. Click <a href="#">here</a></p>

                <h5>How do I know if online ordering is secured?</h5>

                <p>
                    Protecting your information is a top priority for this site. We use Secure Sockets Layer (SSL) to
                    encrypt your credit card number, name and address, so only this site is able to decode your
                    information. SSL is the industry standard method for computers to communicate securely without risk
                    of data interception, manipulation or recipient impersonation. To be sure your connection is secure;
                    when you are in the Shopping Cart, look at the lower corner of your browser window. If you see an
                    unbroken key or closed lock, the SSL is active and your information is secure. Since most of the
                    customers are still uncomfortable with providing your credit card online, we use PayPal and
                    2CheckOut services and they do not need to give out credit card information.</p>

                <p>
                    This site is registerd with HackerGuardian. HackerGuardian certification for a hacker free website
                    and a Credit Card TrustLogo confirming your trustworthiness to take credit card details online.</p>


                <h5>What is your privacy policy?</h5>

                <p>This website respects your privacy and ensure that you understand what information we need to
                    complete your order, and what information you can choose to share with us and with our marketing
                    partners. For complete information on our privacy policy, please visit our <a href="#">Privacy
                        Policy</a> page.</p>

                <div class="cleaner h40"></div>
                <div class="blank_box">
                    <a href="#"><img src="images/free_shipping.jpg" alt="Free Shipping"/></a>
                </div>
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