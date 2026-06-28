.class public Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;
.super Landroid/text/style/URLSpan;
.source "SourceFile"

# interfaces
.implements Lh3/d;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field private final a:Le3/k;

.field private final b:Le3/l;

.field private final c:Lcom/zzhoujay/richtext/d;


# direct methods
.method public constructor <init>(Lcom/zzhoujay/richtext/d;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;-><init>(Lcom/zzhoujay/richtext/d;Le3/k;Le3/l;)V

    return-void
.end method

.method public constructor <init>(Lcom/zzhoujay/richtext/d;Le3/k;Le3/l;)V
    .locals 1

    .line 2
    invoke-virtual {p1}, Lcom/zzhoujay/richtext/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 3
    iput-object p2, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->a:Le3/k;

    .line 4
    iput-object p3, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->b:Le3/l;

    .line 5
    iput-object p1, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->c:Lcom/zzhoujay/richtext/d;

    return-void
.end method


# virtual methods
.method public a()Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;
    .locals 3

    new-instance v0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;

    iget-object v1, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->c:Lcom/zzhoujay/richtext/d;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;-><init>(Lcom/zzhoujay/richtext/d;Le3/k;Le3/l;)V

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->a:Le3/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Le3/k;->a(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Landroid/text/style/URLSpan;->onClick(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->b:Le3/l;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Le3/l;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->c:Lcom/zzhoujay/richtext/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/d;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zzhoujay/richtext/spans/LongClickableURLSpan;->c:Lcom/zzhoujay/richtext/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zzhoujay/richtext/d;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
