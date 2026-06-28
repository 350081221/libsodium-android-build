.class public Lorg/ccil/cowan/tagsoup/jaxp/c;
.super Ljavax/xml/parsers/SAXParserFactory;
.source "SourceFile"


# instance fields
.field private a:Lorg/ccil/cowan/tagsoup/jaxp/d;

.field private b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljavax/xml/parsers/SAXParserFactory;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->a:Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->b:Ljava/util/HashMap;

    .line 8
    .line 9
    return-void
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
.end method

.method private a()Lorg/ccil/cowan/tagsoup/jaxp/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->a:Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/jaxp/d;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->a:Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->a:Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 13
    .line 14
    return-object v0
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
.end method


# virtual methods
.method public getFeature(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/ParserConfigurationException;,
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/jaxp/c;->a()Lorg/ccil/cowan/tagsoup/jaxp/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/ccil/cowan/tagsoup/jaxp/d;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public newSAXParser()Ljavax/xml/parsers/SAXParser;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/ParserConfigurationException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/ccil/cowan/tagsoup/jaxp/d;->b(Ljava/util/Map;)Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    new-instance v1, Ljavax/xml/parsers/ParserConfigurationException;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/xml/sax/SAXException;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {v1, v0}, Ljavax/xml/parsers/ParserConfigurationException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v1
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
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/ParserConfigurationException;,
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/ccil/cowan/tagsoup/jaxp/c;->a()Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lorg/ccil/cowan/tagsoup/jaxp/d;->c(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->b:Ljava/util/HashMap;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/c;->b:Ljava/util/HashMap;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void
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
    .line 86
    .line 87
    .line 88
.end method
