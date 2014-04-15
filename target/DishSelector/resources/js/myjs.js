var baseURL = window.location.protocol + '//' + window.location.hostname + '/';
var APP_ID = 4193934;

function setCookie(name, value, millis) {
    var d = new Date();
    d.setTime(d.getTime() + (millis));
    var expires = "expires=" + d.toGMTString();
    document.cookie = name + "=" + value + "; " + expires;
}

function doLogin() {
    VK.Auth.login(loginOpenAPI);
}
function doLogout() {
    VK.Auth.logout(logoutOpenAPI);
}
function loginOpenAPI(resp) {
    var t;
    if (resp) {
        var expire = resp.session.expire;
        var mid = resp.session.mid;
        var secret = resp.session.secret;
        var sid = resp.session.sid;
        var sig = resp.session.sig;
        setCookie('expire', expire, expire);
        setCookie('mid', mid, expire);
        setCookie('secret', secret, expire);
        setCookie('sid', sid, expire);
        setCookie('sig', sig, expire);
        window.location = baseURL + 'authorize/vk';
    }
}
function logoutOpenAPI() {
    /*window.location.reload();*/
    window.location = baseURL;
}
function getInitData() {
    var code;
    code = 'return {';
    code += 'me: API.getProfiles({uids: API.getVariable({key: 1280}), fields: "photo"})[0]';
    code += '};';
    VK.Api.call('execute', {'code': code}, onGetInitData);
}
function onGetInitData(data) {
    var r;
    if (data.response) {
        r = data.response;
        /* Insert user info */
        if (r.me) {
            showUserData(r.me.first_name, r.me.last_name, r.me.photo);
        }
    } else {

    }
}


$(document)
    .ready(
    function () {
        //add more file components if Add is clicked
        $('#addFile')
            .click(
            function () {
                var fileIndex = $('#fileTable tr').children().length;
                $('#fileTable')
                    .append(
                        '<tr id="row_' + fileIndex + '"><td>'
                            + '   <input type="file" name="file' + fileIndex + '" required onchange="myFunc(this)"/>'
                            + '</td>' + '<td><div id="preview_file' + fileIndex + '"></div></td>' +
                            '<td><a  id="delete_file' + fileIndex + '"href="#" onclick="delFile(this)">delete</a></td>' +
                            '</tr>'
                    )
                ;
            });

    });
function myFunc(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            var container = $('#preview_' + $(input).attr('name'));
            var image = $('<img id="img_' + $(input).attr('name') + '">');
            image.attr('src', e.target.result).attr('class', 'picturePreview');
            container.empty();
            image.appendTo(container);
        };
        reader.readAsDataURL(input.files[0]);
    }
}

function showUserData(name, sername, photoPath) {
    var nameContainer = $('#userName');
    var photoContainer = $('#userPhoto');
    var image = $('<img id="userPhotoImg">');
    image.attr('src', photoPath);
    photoContainer.empty();
    image.appendTo(photoContainer);
    nameContainer.empty();
    nameContainer.append(name + ' ' + sername);

}

function delFile(link) {
    var fileIndex = $(link).attr("id").match(/[\d]+$/);
    $('#row_' + fileIndex).remove();

}

$(document)
    .ready(
    function () {
        $("input[name='cardType']").on('click', function () {
            var cardType = $("input[name='cardType']:checked");
            if (cardType.val() == 'support') {
                $('#warriorCardType').hide();
            } else {
                $('#warriorCardType').show();
            }

        });

        var cardType = $("input[name='cardType']:checked");
        if (cardType.val() == 'support') {
            $('#warriorCardType').hide();
        } else {
            $('#warriorCardType').show();
        }

    });