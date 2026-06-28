.class Lcom/google/gson/internal/bind/n$r$a;
.super Lcom/google/gson/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/bind/n$r;->a(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/x<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/x;

.field final synthetic b:Lcom/google/gson/internal/bind/n$r;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/bind/n$r;Lcom/google/gson/x;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/bind/n$r$a;->b:Lcom/google/gson/internal/bind/n$r;

    iput-object p2, p0, Lcom/google/gson/internal/bind/n$r$a;->a:Lcom/google/gson/x;

    invoke-direct {p0}, Lcom/google/gson/x;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/n$r$a;->j(Lcom/google/gson/stream/JsonReader;)Ljava/sql/Timestamp;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/n$r$a;->k(Lcom/google/gson/stream/JsonWriter;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public j(Lcom/google/gson/stream/JsonReader;)Ljava/sql/Timestamp;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/bind/n$r$a;->a:Lcom/google/gson/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/gson/x;->e(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Date;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/sql/Timestamp;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    return-object v0
    .line 23
    .line 24
.end method

.method public k(Lcom/google/gson/stream/JsonWriter;Ljava/sql/Timestamp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/bind/n$r$a;->a:Lcom/google/gson/x;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/x;->i(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
