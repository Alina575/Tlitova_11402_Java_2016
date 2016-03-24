<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div align='center'>
    <h2>Enter the text and choose the action: </h2>

    <form method='GET' action='/result'>
        <textarea name='text' rows='10' cols='40' placeholder='Text...'></textarea>

        <p><select name='action'>
            <option value='symbols'>Symbols</option>
            <option value='words'>Words</option>
            <option value='sentences'>Sentences</option>
            <option value='paragraph'>Paragraph</option>
        </select></p>
        <input type='submit' value='Process'>

    </form>
</div>
</body>
</html>
