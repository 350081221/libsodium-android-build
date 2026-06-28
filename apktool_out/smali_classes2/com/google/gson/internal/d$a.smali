.class Lcom/google/gson/internal/d$a;
.super Lcom/google/gson/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/d;->a(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/gson/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/x<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Lcom/google/gson/f;

.field final synthetic e:Lcom/google/gson/reflect/a;

.field final synthetic f:Lcom/google/gson/internal/d;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/d;ZZLcom/google/gson/f;Lcom/google/gson/reflect/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/d$a;->f:Lcom/google/gson/internal/d;

    iput-boolean p2, p0, Lcom/google/gson/internal/d$a;->b:Z

    iput-boolean p3, p0, Lcom/google/gson/internal/d$a;->c:Z

    iput-object p4, p0, Lcom/google/gson/internal/d$a;->d:Lcom/google/gson/f;

    iput-object p5, p0, Lcom/google/gson/internal/d$a;->e:Lcom/google/gson/reflect/a;

    invoke-direct {p0}, Lcom/google/gson/x;-><init>()V

    return-void
.end method

.method private j()Lcom/google/gson/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/gson/x<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/d$a;->a:Lcom/google/gson/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/gson/internal/d$a;->d:Lcom/google/gson/f;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/gson/internal/d$a;->f:Lcom/google/gson/internal/d;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/gson/internal/d$a;->e:Lcom/google/gson/reflect/a;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/f;->r(Lcom/google/gson/y;Lcom/google/gson/reflect/a;)Lcom/google/gson/x;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/google/gson/internal/d$a;->a:Lcom/google/gson/x;

    .line 17
    .line 18
    :goto_0
    return-object v0
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public e(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/gson/internal/d$a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->skipValue()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-direct {p0}, Lcom/google/gson/internal/d$a;->j()Lcom/google/gson/x;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/google/gson/x;->e(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public i(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonWriter;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/gson/internal/d$a;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/google/gson/internal/d$a;->j()Lcom/google/gson/x;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/x;->i(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
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
.end method
