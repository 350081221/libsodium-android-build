.class public Lorg/ccil/cowan/tagsoup/jaxp/d;
.super Ljavax/xml/parsers/SAXParser;
.source "SourceFile"


# instance fields
.field final a:Lorg/ccil/cowan/tagsoup/l;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljavax/xml/parsers/SAXParser;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/ccil/cowan/tagsoup/l;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/l;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    .line 10
    .line 11
    return-void
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

.method public static b(Ljava/util/Map;)Lorg/ccil/cowan/tagsoup/jaxp/d;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/ccil/cowan/tagsoup/jaxp/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/ccil/cowan/tagsoup/jaxp/d;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v2, v1}, Lorg/ccil/cowan/tagsoup/jaxp/d;->c(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-object v0
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


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    invoke-virtual {v0, p1}, Lorg/ccil/cowan/tagsoup/l;->getFeature(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    invoke-virtual {v0, p1, p2}, Lorg/ccil/cowan/tagsoup/l;->setFeature(Ljava/lang/String;Z)V

    return-void
.end method

.method public getParser()Lorg/xml/sax/Parser;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    new-instance v0, Lorg/ccil/cowan/tagsoup/jaxp/b;

    iget-object v1, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    invoke-direct {v0, v1}, Lorg/ccil/cowan/tagsoup/jaxp/b;-><init>(Lorg/xml/sax/XMLReader;)V

    return-object v0
.end method

.method public getProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    invoke-virtual {v0, p1}, Lorg/ccil/cowan/tagsoup/l;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getXMLReader()Lorg/xml/sax/XMLReader;
    .locals 1

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    return-object v0
.end method

.method public isNamespaceAware()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    .line 2
    .line 3
    const-string v1, "http://xml.org/sax/features/namespaces"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/ccil/cowan/tagsoup/l;->getFeature(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    new-instance v1, Ljava/lang/RuntimeException;

    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/xml/sax/SAXException;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v1
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

.method public isValidating()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    .line 2
    .line 3
    const-string v1, "http://xml.org/sax/features/validation"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/ccil/cowan/tagsoup/l;->getFeature(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    new-instance v1, Ljava/lang/RuntimeException;

    .line 12
    .line 13
    invoke-virtual {v0}, Lorg/xml/sax/SAXException;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v1
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

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXNotRecognizedException;,
            Lorg/xml/sax/SAXNotSupportedException;
        }
    .end annotation

    iget-object v0, p0, Lorg/ccil/cowan/tagsoup/jaxp/d;->a:Lorg/ccil/cowan/tagsoup/l;

    invoke-virtual {v0, p1, p2}, Lorg/ccil/cowan/tagsoup/l;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
