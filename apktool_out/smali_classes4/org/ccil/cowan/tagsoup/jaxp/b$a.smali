.class final Lorg/ccil/cowan/tagsoup/jaxp/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/xml/sax/AttributeList;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/ccil/cowan/tagsoup/jaxp/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:Lorg/xml/sax/Attributes;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/xml/sax/Attributes;)V
    .locals 0

    iput-object p1, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    return-void
.end method

.method public getLength()I
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    invoke-interface {v0}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v0

    return v0
.end method

.method public getName(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lorg/xml/sax/Attributes;->getQName(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    return-object v0
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
.end method

.method public getType(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    invoke-interface {v0, p1}, Lorg/xml/sax/Attributes;->getType(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    invoke-interface {v0, p1}, Lorg/xml/sax/Attributes;->getType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getValue(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    invoke-interface {v0, p1}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/b$a;->a:Lorg/xml/sax/Attributes;

    invoke-interface {v0, p1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
