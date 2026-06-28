.class public final synthetic Lu1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field public final synthetic a:Ljava/text/SimpleDateFormat;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Ljava/text/SimpleDateFormat;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/f;->a:Ljava/text/SimpleDateFormat;

    iput-wide p2, p0, Lu1/f;->b:J

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Lu1/f;->a:Ljava/text/SimpleDateFormat;

    iget-wide v1, p0, Lu1/f;->b:J

    invoke-static {v0, v1, v2, p1, p2}, Lcom/huawei/agconnect/apms/hilog/task/HiLogConfig;->abc(Ljava/text/SimpleDateFormat;JLjava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
