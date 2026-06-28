.class public final Lcom/yuanqi/master/tools/o0$f;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/tools/o0;->r0(Landroid/content/Context;Lv3/a;Lv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/yuanqi/master/tools/DialogUtil$showPrivateForRegisterDialog$termsOfUseSpan$1",
        "Landroid/text/style/ClickableSpan;",
        "onClick",
        "",
        "view",
        "Landroid/view/View;",
        "updateDrawState",
        "ds",
        "Landroid/text/TextPaint;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/yuanqi/master/tools/o0$f;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/yuanqi/master/tools/o0$f;->a:Landroid/content/Context;

    .line 7
    .line 8
    new-instance v0, Landroid/content/Intent;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/yuanqi/master/tools/o0$f;->a:Landroid/content/Context;

    .line 11
    .line 12
    const-class v2, Lcom/yuanqi/master/start/TextActivity;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/yuanqi/master/tools/o0$f;->a:Landroid/content/Context;

    .line 18
    .line 19
    const v2, 0x7f120269

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "title"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    const-string v1, "content"

    .line 32
    .line 33
    const-string v2, "<!DOCTYPE html>\n<html lang=\"zh-CN\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n</head>\n\n<body>\n    <h1>\u5143\u6c14\u591a\u5f00\u7528\u6237\u534f\u8bae</h1>\n    <p>\u6b22\u8fce\u4f7f\u7528\u5143\u6c14\u591a\u5f00\uff01</p>\n    <p>\u5143\u6c14\u591a\u5f00\u662f\u4e00\u6b3e\u591a\u5f00\u5e94\u7528\u7ba1\u7406\u5de5\u5177\uff0c\u53ef\u4ee5\u5e2e\u52a9\u60a8\u5728\u540c\u4e00\u8bbe\u5907\u4e0a\u540c\u65f6\u8fd0\u884c\u591a\u4e2a\u540c\u4e00APP\u5b9e\u4f8b\u3002\u4e3a\u4e86\u4fdd\u969c\u60a8\u7684\u5408\u6cd5\u6743\u76ca\uff0c\u8bf7\u60a8\u5728\u4f7f\u7528\u524d\u4ed4\u7ec6\u9605\u8bfb\u5e76\u540c\u610f\u672c\u7528\u6237\u534f\u8bae\u3002</p>\n    <h2>\u4e00\u3001\u670d\u52a1\u5185\u5bb9</h2>\n    <ol>\n        <li>\u5143\u6c14\u591a\u5f00\u63d0\u4f9b\u591a\u5f00\u5e94\u7528\u529f\u80fd\uff0c\u5141\u8bb8\u60a8\u5728\u540c\u4e00\u8bbe\u5907\u4e0a\u540c\u65f6\u8fd0\u884c\u591a\u4e2a\u5e94\u7528\u8d26\u53f7\u3002</li>\n        <li>\u5143\u6c14\u591a\u5f00\u53ef\u80fd\u5305\u542b\u5e7f\u544a\uff0c\u5e7f\u544a\u5185\u5bb9\u7531\u5143\u6c14\u591a\u5f00\u5408\u4f5c\u4f19\u4f34\u63d0\u4f9b\u3002</li>\n    </ol>\n    <h2>\u4e8c\u3001\u7528\u6237\u6743\u5229\u548c\u4e49\u52a1</h2>\n    <ol>\n        <li>\u60a8\u6709\u6743\u4f7f\u7528\u5143\u6c14\u591a\u5f00\u63d0\u4f9b\u7684\u670d\u52a1\u3002</li>\n        <li>\u60a8\u6709\u6743\u5bf9\u5143\u6c14\u591a\u5f00\u63d0\u51fa\u610f\u89c1\u548c\u5efa\u8bae\u3002</li>\n        <li>\u60a8\u5e94\u5f53\u9075\u5b88\u56fd\u5bb6\u6cd5\u5f8b\u6cd5\u89c4\u548c\u672c\u534f\u8bae\u7684\u89c4\u5b9a\uff0c\u4f7f\u7528\u5143\u6c14\u591a\u5f00\u3002</li>\n        <li>\u60a8\u4e0d\u5f97\u5229\u7528\u5143\u6c14\u591a\u5f00\u8fdb\u884c\u4efb\u4f55\u8fdd\u6cd5\u6216\u8fdd\u89c4\u884c\u4e3a\uff0c\u5305\u62ec\u4f46\u4e0d\u9650\u4e8e\uff1a</li>\n        <ul>\n            <li>\u53d1\u5e03\u3001\u4f20\u64ad\u865a\u5047\u4fe1\u606f\u6216\u8bef\u5bfc\u6027\u4fe1\u606f\uff1b</li>\n            <li>\u4e0a\u4f20\u3001\u4f20\u64ad\u6deb\u79fd\u8272\u60c5\u3001\u66b4\u529b\u3001\u6050\u6016\u7b49\u975e\u6cd5\u5185\u5bb9\uff1b</li>\n            <li>\u4fb5\u72af\u4ed6\u4eba\u77e5\u8bc6\u4ea7\u6743\u6216\u5176\u4ed6\u5408\u6cd5\u6743\u76ca\uff1b</li>\n            <li>\u4f7f\u7528\u5143\u6c14\u591a\u5f00\u8fdb\u884c\u4efb\u4f55\u5546\u4e1a\u63a8\u5e7f\u6216\u76c8\u5229\u6d3b\u52a8\u3002</li>\n        </ul>\n    </ol>\n    <h2>\u4e09\u3001\u9690\u79c1\u653f\u7b56</h2>\n    <p>\u5143\u6c14\u591a\u5f00\u4f1a\u6536\u96c6\u60a8\u7684\u8bbe\u5907\u4fe1\u606f\u3001\u5e94\u7528\u4f7f\u7528\u60c5\u51b5\u7b49\u6570\u636e\uff0c\u5e76\u5c06\u7528\u4e8e\u6539\u5584\u670d\u52a1\u4f53\u9a8c\u548c\u5c55\u793a\u5e7f\u544a\u3002\u6211\u4eec\u627f\u8bfa\u4f1a\u4e25\u683c\u4fdd\u62a4\u60a8\u7684\u9690\u79c1\uff0c\u5e76\u6309\u7167\u300a\u9690\u79c1\u653f\u7b56\u300b\u6536\u96c6\u548c\u4f7f\u7528\u60a8\u7684\u4e2a\u4eba\u4fe1\u606f\u3002</p>\n    <h2>\u56db\u3001\u514d\u8d23\u58f0\u660e</h2>\n    <ol>\n        <li>\u5143\u6c14\u591a\u5f00\u4ec5\u63d0\u4f9b\u591a\u5f00\u5e94\u7528\u529f\u80fd\uff0c\u4e0d\u627f\u62c5\u4efb\u4f55\u56e0\u60a8\u4f7f\u7528\u5143\u6c14\u591a\u5f00\u800c\u4ea7\u751f\u7684\u6cd5\u5f8b\u8d23\u4efb\u3002</li>\n        <li>\u5143\u6c14\u591a\u5f00\u4e0d\u4fdd\u8bc1\u6240\u63d0\u4f9b\u7684\u670d\u52a1\u4e00\u5b9a\u6ee1\u8db3\u60a8\u7684\u6240\u6709\u9700\u6c42\u3002</li>\n        <li>\u5143\u6c14\u591a\u5f00\u53ef\u80fd\u56e0\u7f51\u7edc\u539f\u56e0\u3001\u670d\u52a1\u5668\u6545\u969c\u7b49\u56e0\u7d20\u5bfc\u81f4\u670d\u52a1\u4e2d\u65ad\u6216\u5ef6\u8fdf\uff0c\u5bf9\u6b64\u6211\u4eec\u4e0d\u627f\u62c5\u4efb\u4f55\u8d23\u4efb\u3002</li>\n    </ol>\n    <h2>\u4e94\u3001\u534f\u8bae\u53d8\u66f4</h2>\n    <p>\u5143\u6c14\u591a\u5f00\u6709\u6743\u968f\u65f6\u53d8\u66f4\u672c\u534f\u8bae\u3002\u5982\u672c\u534f\u8bae\u5185\u5bb9\u53d1\u751f\u53d8\u66f4\uff0c\u6211\u4eec\u4f1a\u4ee5\u9002\u5f53\u65b9\u5f0f\u901a\u77e5\u60a8\u3002\u5982\u679c\u60a8\u4e0d\u540c\u610f\u53d8\u66f4\u5185\u5bb9\uff0c\u53ef\u4ee5\u505c\u6b62\u4f7f\u7528\u5143\u6c14\u591a\u5f00\u3002</p>\n    <h2>\u516d\u3001\u6cd5\u5f8b\u9002\u7528\u548c\u4e89\u8bae\u89e3\u51b3</h2>\n    <p>\u672c\u534f\u8bae\u9002\u7528\u4e2d\u534e\u4eba\u6c11\u5171\u548c\u56fd\u6cd5\u5f8b\u3002\u56e0\u672c\u534f\u8bae\u5f15\u8d77\u7684\u4efb\u4f55\u4e89\u8bae\uff0c\u53cc\u65b9\u5e94\u53cb\u597d\u534f\u5546\u89e3\u51b3\u3002\u5982\u534f\u5546\u4e0d\u6210\uff0c\u4efb\u4f55\u4e00\u65b9\u5747\u53ef\u5411\u5143\u6c14\u591a\u5f00\u6240\u5728\u5730\u4eba\u6c11\u6cd5\u9662\u63d0\u8d77\u8bc9\u8bbc\u3002</p>\n\n    <h2>\u4e03\u3001\u6ce8\u518c\u53ca\u767b\u5f55</h2>\n    <p>\u4e3a\u4fbf\u4e8e\u6211\u4eec\u4e3a\u60a8\u63d0\u4f9b\u670d\u52a1\uff0c\u60a8\u9700\u8981\u63d0\u4f9b\u57fa\u672c\u6ce8\u518c\u6216\u767b\u5f55\u4fe1\u606f\uff0c\u5305\u62ec\u624b\u673a\u53f7\u7801\u3001\u7535\u5b50\u90ae\u7bb1\u5730\u5740\uff0c\u5e76\u521b\u5efa\u60a8\u7684\u5e10\u53f7\u3001\u7528\u6237\u540d\u548c\u5bc6\u7801\uff0c\u6211\u4eec\u5c06\u901a\u8fc7\u53d1\u9001\u77ed\u4fe1\u9a8c\u8bc1\u7801\u6216\u90ae\u4ef6\u7684\u65b9\u5f0f\u6765\u9a8c\u8bc1\u60a8\u7684\u8eab\u4efd\u662f\u5426\u6709\u6548\u3002</p>\n\n    <h2>\u516b\u3001\u4e0b\u5355\u53ca\u652f\u4ed8</h2>\n    <p>\u5728\u4e0b\u5355\u8fc7\u7a0b\u4e2d\uff0c\u60a8\u81f3\u5c11\u9700\u63d0\u4f9b\u60a8\u7684\u4e2a\u4eba\u8d26\u53f7\u4fe1\u606f\u3001\u8054\u7cfb\u7535\u8bdd\u3001\u652f\u4ed8\u72b6\u6001\u4fe1\u606f\u3002\u4e3a\u5c55\u793a\u60a8\u5e10\u53f7\u7684\u8ba2\u5355\u4fe1\u606f\uff0c\u6211\u4eec\u4f1a\u6536\u96c6\u60a8\u5728\u4f7f\u7528\u6211\u4eec\u63d0\u4f9b\u7684\u4ea7\u54c1\u4e0e/\u6216\u670d\u52a1\u8fc7\u7a0b\u4e2d\u4ea7\u751f\u7684\u8ba2\u5355\u4fe1\u606f\uff08\u4f8b\u5982\u60a8\u6240\u8d2d\u4e70\u7684\u4ea7\u54c1\u4e0e/\u6216\u670d\u52a1\u4fe1\u606f\u3001\u5177\u4f53\u8ba2\u5355\u53f7\u3001\u8ba2\u5355\u521b\u5efa\u65f6\u95f4\u3001\u4ea4\u6613\u91d1\u989d\uff09\u7528\u4e8e\u5411\u60a8\u5c55\u793a\u53ca\u4fbf\u4e8e\u60a8\u5bf9\u8ba2\u5355\u8fdb\u884c\u7ba1\u7406\u3002</p>\n\n    <h2>\u4e5d\u3001\u5176\u4ed6</h2>\n    <ol>\n        <li>\u672c\u534f\u8bae\u81ea\u60a8\u70b9\u51fb\u201c\u540c\u610f\u201d\u6309\u94ae\u65f6\u751f\u6548\u3002</li>\n        <li>\u672c\u534f\u8bae\u7684\u6700\u7ec8\u89e3\u91ca\u6743\u5f52\u5143\u6c14\u591a\u5f00\u6240\u6709\u3002</li>\n    </ol>\n    <h2>\u8054\u7cfb\u65b9\u5f0f</h2>\n    <ul>\n        <li>\u90ae\u7bb1\u5730\u5740\uff1a3818531525@qq.com</li>\n    </ul>\n    <p>\u611f\u8c22\u60a8\u4f7f\u7528\u5143\u6c14\u591a\u5f00\uff01</p>\n</body>\n\n</html>"

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "ds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/yuanqi/master/tools/o0$f;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const v1, 0x7f060030

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
.end method
